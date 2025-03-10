class Mask{
	public static void material(String fabricType) 
	{
		System.out.println(fabricType); 
	}
    public static void layerCount(int layers) 
	{
		System.out.println(layers);
	}
    public static void isReusable(boolean reusable)
	{
		System.out.println(reusable); 
	}
	public static void wearMask(String fitType, boolean adjustableStraps) 
	{ 
        System.out.println(fitType);
		System.out.println(adjustableStraps); 
    }
    public static void removeMask(boolean safelyRemoved, String disposalMethod)
	{ 
        System.out.println(safelyRemoved); 
		System.out.println(disposalMethod); 
    }
	public static void purchase(boolean bulkPurchase, char sizeLabel, String storeName)
	{ 
        System.out.println(bulkPurchase);
		System.out.println(sizeLabel);
		System.out.println(storeName); 
    }
    public static void filterEfficiency(int efficiency, boolean antiViral, String standardCertification) 
	{ 
        System.out.println(efficiency);
		System.out.println(antiViral);
		System.out.println(standardCertification); 
    }
}