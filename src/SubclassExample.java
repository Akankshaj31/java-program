
    class superclass
    {
        public void show()
        {
            System.out.println("Parent Class");
        }
    }
    public class SubclassExample extends superclass{
        SubclassExample()
        {
            super.show();
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            SubclassExample obj=new SubclassExample();
        }
}
