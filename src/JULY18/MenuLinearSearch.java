package JULY18;

public class MenuLinearSearch {
    public static int menuLinearSearch(String menu[],String key){
        for(int i =0; i<menu.length; i++){
            if(key == menu[i]){
                return i;
            }
        };
        return -1;
    };
    public static void main(String[] args) {
        String menu[] = {"Dosa","Burger","Pizza","Mango shake","Chocolate shake"};
        String key = "Pizza";

        System.out.println(menuLinearSearch(menu,key));
    }
}
