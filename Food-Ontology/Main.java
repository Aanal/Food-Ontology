public class Main{

	public static void main(String[] argvs)
	{
		Category fruit_dishes = new Category();
		Category apple_dishes = new Category();
		Category banana_dishes = new Category();
		Category citrus_dishes = new Category();
		Category melon_dishes = new Category();
		Category plum_dishes = new Category();
		Category fruit_salads = new Category();
		Category strawberry_dishes = new Category();
		fruit_dishes.subcategory.add(apple_dishes);
		fruit_dishes.subcategory.add(banana_dishes);
		fruit_dishes.subcategory.add(citrus_dishes);
		fruit_dishes.subcategory.add(melon_dishes);
		fruit_dishes.subcategory.add(plum_dishes);
		fruit_dishes.subcategory.add(fruit_salads);
		fruit_dishes.subcategory.add(strawberry_dishes);
	}
}