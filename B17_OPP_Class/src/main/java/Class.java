public class Class {
    private long id;
    private String tenLop;
    private String GVCN;

    public Class(long id, String tenLop, String GVCN) {
        this.id = id;
        this.tenLop = tenLop;
        this.GVCN= GVCN;
    }
    @Override
    public String toString()
    {
        return "Mã lớp:"+id+", Tên lớp:"+tenLop+", GVCN: "+GVCN;
    }
}