public class stringBuilder {
    public String reverse(String name) {
        StringBuilder output = new StringBuilder();
        String[]array= name.split("\\s");
        name= name.trim();
        // Vị trí đảo ngược
        for(int i = array.length-1; i>=0;i--)
        {
            output.append(array[i]);
            output.append(' ');
        }
        return output.toString().trim();
    }

    public void DN()
    {
        StringBuilder a = new StringBuilder("ABCD");
        StringBuilder b = new StringBuilder("DCBA");
        StringBuilder c = a.reverse();
        if(b==c||a==c)
        {
            System.out.println("Là đảo ngược");
        }
        else {
            System.out.println("Không đảo ngược");
        }
    }
}
