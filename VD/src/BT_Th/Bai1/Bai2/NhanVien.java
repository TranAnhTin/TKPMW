package BT_Th.Bai1.Bai2;

import java.lang.reflect.Constructor;

public class NhanVien {
    String name,address;
    Integer age,tsgl;
    Double salary;
    public NhanVien() {
    }
    public NhanVien(String name, String address, Integer age, Integer tsgl, Double salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.tsgl = tsgl;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTsgl() {
        return tsgl;
    }

    public void setTsgl(Integer tsgl) {
        this.tsgl = tsgl;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getThongTin(){
        return "Ten:"+name+"Dia chi:"+address+"Tuoi:"+age+"Luong:"+salary+"Thoi gian lam viec:"+tsgl;
    }
    public double tinhThuong(){
        double thuong;
        if (tsgl<100)
            thuong=0;
        else if (tsgl>=100 && tsgl<200)
            thuong=salary*0.1;

        else
            thuong=salary*0.2;
        return thuong;
    }
}

