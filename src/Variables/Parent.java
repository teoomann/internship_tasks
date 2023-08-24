package Variables;

class Parent {
    private String ad;

    public Parent(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }
}

class Child extends Parent {
    public Child(String ad) {
        super(ad);
    }

    private String getAd() {
        return "selam";
    }

    public static void main(String[] args) {
        Parent parent = new Parent ("ana class adı");
        Child child = new Child("çocuk class ady");
        System.out.println(child.getAd());
    }
}