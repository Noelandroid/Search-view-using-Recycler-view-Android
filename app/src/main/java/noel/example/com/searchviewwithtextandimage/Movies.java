package noel.example.com.searchviewwithtextandimage;

public  class Movies {
    private  int imageResource;
    private String name;
    private String year;


    public Movies() {

    }


    public  Movies(int imageResource,String name,String year){
        this.imageResource=imageResource;
        this.name=name;
        this.year=year;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
