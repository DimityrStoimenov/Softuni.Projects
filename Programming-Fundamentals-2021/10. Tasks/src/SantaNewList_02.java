import java.util.*;

public class SantaNewList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Children> children = new LinkedHashMap<>();
        Map< String,Integer> presents = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("->");
            if (tokens[0].equals("Remove")) {
                String childName = tokens[1];
                if(children.containsKey(childName)) {
                   children.remove(childName);
                }
            } else {
                String childName = tokens[0];
                String typeOfPresent = tokens[1];
                int amount = Integer.parseInt(tokens[2]);
                if(!children.containsKey(childName)) {
                    Children newChildren = new Children(new ArrayList<>(),amount);
                    children.put(childName,newChildren);
                    children.get(childName).getPresent().add(typeOfPresent);


                } else {
                    if(!children.get(childName).getPresent().contains(typeOfPresent)) {
                        children.get(childName).getPresent().add(typeOfPresent);
                        int increasedCurrentValue = children.get(childName).getAmount() + amount;
                        children.get(childName).setAmount(increasedCurrentValue);
                    }
                }
                if(!presents.containsKey(typeOfPresent)) {
                    presents.put(typeOfPresent, amount);
                } else {
                    presents.put(typeOfPresent, presents.get(typeOfPresent) + amount);
                }
            }


            input = scan.nextLine();
        }
        System.out.println("Children:");
        children
                .entrySet()
                .stream()
                .sorted((a,b) -> {
                    int result = Integer.compare(b.getValue().getAmount(),a.getValue().getAmount());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue().getAmount()));
        System.out.println("Presents:");
        presents
                .forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}

class Children {
    private List<String> Present;
    private int amount;

    public List<String> getPresent() {
        return Present;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Children(List<String>Present, int amount) {
        this.Present = Present;
        this.amount = amount;
    }
}
