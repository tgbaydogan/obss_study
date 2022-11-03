package pojo;

import java.util.List;

public class Create_json {
	private int id;
	private String name;
	private Category kategori;
	private List <PhotoUrls> photoUrls;
	private List <Tags> tagss;
	private boolean status;
	
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getKategori() {
		return kategori;
	}
	public void setKategori(Category string) {
		this.kategori = string;
	}
	public List<PhotoUrls> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(List<PhotoUrls> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public List<Tags> getTagss() {
		return tagss;
	}
	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}


	

}
