public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    //      hàm để khởi tạo biến
    Student( int r,String n){
        rollNo =r;
        name = n;
    }
    // phương thức static để thay đổi giá trị của biến static
    static void change(){
        college = "RIKKEI ACADEMY";
    }
    // phương thức hiển thị giá trị
    void  display(){
        System.out.println(rollNo + " " +name + " "+ college);
    }
}

