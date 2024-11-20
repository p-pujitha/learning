import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<LoanOffer> loanOffers = new ArrayList<>();
        loanOffers.add(new LoanOffer("A",50000,5.5));
        loanOffers.add(new LoanOffer("B",40000,6.5));
        loanOffers.add(new LoanOffer("C",60000,5.5));
        loanOffers.add(new LoanOffer("D",60000,6.5));
        bestLoanOffers(loanOffers);


    }

    public  static void bestLoanOffers(List<LoanOffer> loanOffers){
        Map< String, Map<Double,LoanOffer>> offersMap = new HashMap<>();
        for( LoanOffer offer : loanOffers){
            offersMap.computeIfAbsent(offer.getBank(), k->new HashMap<>()).merge(offer.getAmount(),offer,(existingOffer, newoffer)->newoffer.getIntrestrate()<existingOffer.getIntrestrate()?newoffer :existingOffer);
        }
        Map<String,LoanOffer> bestOffers = new HashMap<>();
        for (Map.Entry<String,Map<Double,LoanOffer>> entry : offersMap.entrySet()){
            String key = entry.getKey();
            LoanOffer bestOffer = entry.getValue().values().stream().min(Comparator.comparingDouble(LoanOffer::getIntrestrate)).orElse(null);
            if(bestOffer !=null ){
                bestOffers.put(bestOffer.getBank(), bestOffer);
            }
        }

        bestOffers.forEach( (bank,offer)->System.out.println(bank + " "+ offer));
    }
}
