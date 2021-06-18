import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        /*---Bài 1: Viết chương trình QLDS sản phẩm bao gồm các thông tin mã, tên, số lượng, giá
         * Thực hiện các công việc: Thêm, tìm kiếm dựa theo tên, sửa, xóa sản phẩm */

        ArrayList<Products> listProducts = new ArrayList<>();

        //add product
        Products product= new Products(0,"Samsung galaxy S7",10,6000000);
        listProducts.add(product);
        listProducts.add(new Products(1,"Iphone",5, 25000000));
        listProducts.add(new Products(2,"Vsmart",15, 1500000));

        System.out.println("---Danh sách sản phẩm: ");
        for (Products emp : listProducts){
            System.out.println(emp);
        }
        // Search product
        System.out.println("---Thông tin sản phẩm điện thoại iphone: ");
        for(int i=0;i<listProducts.size();i++ )
        {
            if(listProducts.get(i).name.contains("Iphone"))
            {
                System.out.println(listProducts.get(i));
            }
        }
        // Edit thông tin sản phẩm vinsmart

        for(int i=0;i<listProducts.size();i++ )
        {
            if(listProducts.get(i).name.contains("Vsmart"))
            {
                System.out.println(listProducts.get(i));
                listProducts.get(i).name="Vinsmart Joy 4";
                listProducts.get(i).quantity=6;
                listProducts.get(i).price=3000000;
            }
        }
        System.out.println("---Danh sách sản phẩm sau khi edit: ");
        for (Products pr:listProducts) {
            System.out.println(pr);
        }
        // Remove product
        for(int i=0;i<listProducts.size();i++ )
        {
            if(listProducts.get(i).name.contains("Iphone"))
            {
                System.out.println(listProducts.get(i));
                listProducts.remove(listProducts.get(i));
            }
        }
        System.out.println("Danh sách sau khi xoá: ");
        for (Products emp : listProducts){
            System.out.println(emp);
        }

        /* Bài 2: Viết chương trình QLNV bao gồm: mã, tên, tuổi, địa chỉ, SDT
        Thực hiện:
        - Thêm thông tin
        - Nhập vào tên nv tìm kiếm xem có trong danh sách hay không, có thì sửa, không thì
        thông báo không có nv này
        - Nhập vào mã nv, ktra xem có trong danh sách không, có xóa, không có báo không có
         */

        ArrayList<Employeer> listEmployeers = new ArrayList<>();
        // Add employees
        listEmployeers.add(new Employeer(1001,"Nguyễn Thị Hoa",20,"Hà Nội","0987654321"));
        listEmployeers.add(new Employeer(1002,"Nguyễn Thị Hà",25,"Hà Nam","0987463531"));
        listEmployeers.add(new Employeer(1003,"Trần Thị Mai",30,"Hưng Yên","0987214545"));
        listEmployeers.add(new Employeer(1004,"Nguyễn Thị Huyền",27,"Hải Dương","0987555321"));
        System.out.println("---Danh sách nhân viên ---: ");
        for (Employeer employeer : listEmployeers){
            System.out.println(employeer);
        }
        // Nhập tên nhân viên tìm kiếm, có thì đổi tên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần tìm kiếm: ");
        String n = sc.nextLine();
        boolean check = false;
        for(int i=0; i<listEmployeers.size();i++)
        {
            if(listEmployeers.get(i).name.contains(n))
            {
                System.out.println(listEmployeers.get(i));
                listEmployeers.get(i).name="Đỗ Mai Anh";
                check = true;
                break;
            } else
                System.out.println("Không có nhân viên này");
        }
        if(!check) {
            System.out.println("Không có mã nhân viên này");
        }
        System.out.println("Danh sách sau khi sửa: ");
        for (Employeer emp : listEmployeers){
            System.out.println(emp);
        }
        // Nhập mã nhân viên tìm kiếm có thì remove
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần tìm kiếm: ");
        int id = sc1.nextInt();
        boolean check1 = false;
        for(int i=0; i<listEmployeers.size();i++)
        {
            if(listEmployeers.get(i).id==id)
            {
                System.out.println(listEmployeers.get(i));
                listEmployeers.remove(listEmployeers.get(i));
                check1 = true;
                break;
            }
        }
        if(!check1) {
            System.out.println("Không có mã nhân viên này");
        }
        System.out.println("Danh sách NV ");
        for (Employeer em : listEmployeers){
            System.out.println(em);
        }

    }
}
