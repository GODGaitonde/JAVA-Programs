import java.util.Scanner;
	enum Material{	
		Iron,Steel,Wood;
		public static Material acceptMaterial(){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().toLowerCase().equals("iron"))
			return Iron;
		else if (str.trim().toLowerCase().equals("steel"))
			return Steel;
		else
			return Wood;
	}
}
enum MaterialType{
		Chair,Table,Bed;
		public static MaterialType acceptMaterialType(){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().toLowerCase().equals("chair"))
			return Chair;
		else if(str.trim().toLowerCase().equals("table"))
			return Table;
		else			
			return Bed;
		}
}
			 
class Furniture{
	protected int modelno;
	protected String modelname;
	protected String modeldes;
	protected Material material;
	protected MaterialType materialtype;
	
	public Furniture(){
		modelname = new String();
		modeldes = new String();
		material = Material.Wood;
		materialtype = MaterialType.Bed;
	}
	public Furniture(int modelno, String modelname, String modeldes, Material  material, MaterialType materialtype){
		this.modelno=modelno; 
		this.modelname=modelname;
		this.modeldes=modeldes;
		this.material = material;
		this.materialtype = materialtype;
	}
	public void acceptData(){
		Scanner in = new Scanner(System.in); 
		System.out.println("enter the model no: ");
		modelno = in.nextInt();
		System.out.println("enter the model name: ");
		modelname = in.nextLine();
		modelname = in.nextLine();
		System.out.println("enter the model description: ");
		modeldes = in.nextLine();
		System.out.println("enter the material: ");
		material = material.acceptMaterial();
		System.out.println("enter the material type: ");
		materialtype = materialtype.acceptMaterialType();
	}
	public void showData(){
		System.out.println("model no :" + modelno);
		System.out.println("model name :" + modelname);
		System.out.println("model descripation :" + modeldes);
		System.out.println("material :" + material);
		System.out.println("material type :" + materialtype);
	}
	public static void main(String[] args){
		Furniture f = new Furniture();
		f.acceptData();
		f.showData();
		
	}
}	