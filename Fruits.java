class fruit{
	//class attributes
	String country_of_origin;
	float price_per_kilo;
	float weight;

	//constructor
	public fruit(String country_of_origin, float price_per_kilo, float weight){
		this.country_of_origin = country_of_origin;
		this.price_per_kilo = price_per_kilo;
		this.weight = weight;
	}

	//getter
	public String getCountry_of_origin() {
		return country_of_origin;
	}

	//setter
	public void setCountry_of_origin(String newCountry_of_origin) {
		this.country_of_origin = newCountry_of_origin;
	}

	//getter
	public float getPrice_per_kilo() {
		return price_per_kilo;
	}

	//setter
	public void SetPrice_per_kilo(float newPrice_per_kilo) {
		this.price_per_kilo= newPrice_per_kilo;
	}

	//getter
	public float getWeight() {
		return weight;
	}

	//setter
	public void setWeight(float newWeight) {
		this.weight = newWeight;
	}

	 public void _toString(){
	 	System.out.println("Country_of_origin: " + country_of_origin);
		System.out.println("Price_per_kilo: " + price_per_kilo);
        System.out.println("Weight: " + weight);
	}
}
//Extention to apple class from main fruit class
class apple extends fruit{
	String apple_variety;
	String apple_colour;

	public apple(String Country_of_origin, float Price_per_kilo, float Weight, String Apple_Variety, String Apple_Colour){
		super(Country_of_origin, Price_per_kilo, Weight);
        this.apple_variety = Apple_Variety;
        this.apple_colour = Apple_Colour;
     }

     //getter
     public String getApple_Variety(){
     	return apple_variety;
     }

     //setter
     public void setContient_of_Origin(String newApple_Variety){
     	this.apple_variety = newApple_Variety;
     }

     //getter
     public String getApple_Colour(){
     	return apple_colour;
     }

     //setter
     public void setApple_Colour(String newApple_Colour){
     	this.apple_colour = newApple_Colour;
     }

     public void _toString(){
     	super._toString();
     	System.out.println("Apple Variety: " + apple_variety);
     	System.out.println("Apple Colour: " + apple_colour);
     }

}
//Extention to orange class from main fruit class
class orange extends fruit{
	String orange_type;
	boolean with_seeds;

	public orange(String Country_of_origin, float Price_per_kilo, float Weight, String Orange_Type, boolean With_Seeds){
		super(Country_of_origin, Price_per_kilo, Weight);
        this.orange_type = Orange_Type;
        this.with_seeds = With_Seeds;
     }

     //getter
     public String getOrange_Type(){
     	return orange_type;
     }

     //setter
     public void setOrange_Type(String newOrange_Type){
     	this.orange_type = newOrange_Type;
     }

     //getter
     public boolean with_seeds(){
     	return with_seeds;
     }

     //setter
     public void setWith_Seeds(boolean newWith_Seeds){
     	this.with_seeds = newWith_Seeds;
     }

     public void _toString(){
     	super._toString();
     	System.out.println("Orange Type: " + orange_type);
     	System.out.println("With_Seeds: " + with_seeds);
     }

}
//Extention to melon class from main fruit class
class melon extends fruit{
	String Variety_of_Melon;
	boolean with_seeds_or_seedless;

	public melon(String Country_of_origin, float Price_per_kilo, float Weight, String Variety_of_Melon, boolean With_Seeds_or_seedless){
		super(Country_of_origin, Price_per_kilo, Weight);
        this.Variety_of_Melon = Variety_of_Melon;
        this.with_seeds_or_seedless = with_seeds_or_seedless;
     }

     //getter
     public String Variety_of_Melon(){
     	return Variety_of_Melon;
     }

     //setter
     public void setVariety_of_Melon(String newVariety_of_Melon){
     	this.Variety_of_Melon = newVariety_of_Melon;
     }

     //getter
     public boolean with_seeds_or_seedless(){
     	return with_seeds_or_seedless;
     }

     //setter
     public void setwith_seeds_or_seedless(boolean newwith_seeds_or_seedless){
     	this.with_seeds_or_seedless = newwith_seeds_or_seedless;
     }

     public void _toString(){
     	super._toString();
     	System.out.println("Variety_of_Melon: " + Variety_of_Melon);
     	System.out.println("Seedless: " + with_seeds_or_seedless);
     }

}


public class fruitTesting {
//Printing an attribute of an diffrent fruits
    public static void main(String[] args) {
    	fruit f = new fruit("Spain", 1, 4);
    	f._toString();

    	System.out.println("--------------------");

    	apple a = new apple("England", 2, 3, "Adams Pearmain", "Red");
    	a._toString();

    	System.out.println("--------------------");

    	orange o = new orange("Spain", 1, 2, "Tangerine", false);
    	o._toString();

    	System.out.println("--------------------");

    	melon m = new melon ("China", 3, 2, "Watermelon", false);
    	m._toString();



    }
}
