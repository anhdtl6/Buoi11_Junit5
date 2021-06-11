public class Main {
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder();
        System.out.println("Dung lượng chuỗi: "+str.capacity());
        StringBuilder str1= new StringBuilder(50);
        StringBuilder str2= new StringBuilder("AnhDTL9 ABCD");
        str2.append("học Java");
        System.out.println(str2);
        // Đảo chuỗi
        //str2.reverse();
        System.out.println("Chuỗi sau khi đảo: "+str2);
        int i= str2.indexOf("D");
        System.out.println("vị trí đầu tiên: "+i);
        int j= str2.lastIndexOf("D");
        System.out.println("vị trí cuối cùng: "+j);
        //Lấy chuỗi con từ vị trí số 8 về sau
        System.out.println(str2.substring(8));
        //Cắt chuỗi
        String str3="Đỗ Thị Lan Anh";
        String[] array= str3.split("\\s");
        // Vị trí lần lượt
        for(int k =0; k< array.length;k++)
        {
            System.out.println("Phần tử thứ " +k+ ":"+array[k]);
        }
        // Vị trí đảo ngược
//        for(int k = array.length-1; k>=0;k--)
//        {
//            System.out.println(array[k]);
//        }
        stringBuilder reName= new stringBuilder();
        String newName=reName.reverse("Đỗ Thị Lan Anh");
        System.out.println("Chuỗi đảo ngược là: "+ newName);
//        strB.DN();
    }
}
