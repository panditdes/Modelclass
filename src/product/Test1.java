package product;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Model k = new Model();
          
          k.setName("i love india");
          k.setEmail("aksh@gmail.com");
          k.setPhone("9859875864");
          k.setPassword("Panda123");
          k.setCity("pune");
          
          
          System.out.println(k.getName());
          System.out.println(k.getEmail());
          System.out.println(k.getPhone());
          System.out.println(k.getPassword());
          System.out.println(k.getCity());
       
          
          System.out.println("===============================================================================");
	
          k.setproductname("Whats up Group");
          k.setProductPrice(15000);
          k.setProductDetails("you can use this to card to get offer");
          k.setProductID("abc123");
          
          System.out.println(k.getproductname());
          System.out.println(k.getProductPrice());
          System.out.println(k.getProductDetails());
          System.out.println(k.getProductID());
	
	}

}
