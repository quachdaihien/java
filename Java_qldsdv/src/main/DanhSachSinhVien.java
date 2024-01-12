package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	public void themSV(SinhVien sv) {
		System.out.println(sv);
		this.danhSach.add(sv);
	}
	public void inDanhSach() {
		for(SinhVien sv : danhSach) {
			System.out.println(sv.toString());
		}
	}
	public boolean checkEmpty() {
		System.out.println("Danh sách rỗng:"+this.danhSach.isEmpty());
		return this.danhSach.isEmpty();
	}
	public int sizeList() {
		System.out.println("size"+this.danhSach.size());
		return this.danhSach.size();
	}
	public void doEmpty() {
		this.danhSach.removeAll(danhSach);
		System.out.println("Danh sach: "+this.danhSach.size());
	}
	public boolean checkExist(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	public boolean removeSV(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	public void findSV(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}
	public void sortSv() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
					return 1;
				}
				else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
	}
}
