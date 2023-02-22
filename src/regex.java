
    class cha{ //custum class   // a-z A-Z SushantNandy
        int id_num; String name; String regex="^[a-zA-Z]+$";   // A.....Zand a....z    a==3;
        public void set(int id1, String name1){
            this.id_num=id1;
            if (name1.matches(regex)){
                this.name=name1;
            }else {
                System.out.println("wrong name set");
            }
        }
        public int getId_num(){
            return id_num;
        }
        public String get_my_Name(){
            return name;
        }
    }

    public class regex {
        public static void main(String[] args) {
            cha c=new cha();
            c.set(123,"Akanksha");
            System.out.println(c.getId_num());
            System.out.println(c.get_my_Name());
        }
    }

