class MaskRunner{
	public static void main(String[] args){
		
		String fabric="Cotton";
		Mask.material(fabric);
		
		int layers=3;
		Mask.layerCount(layers);
		
		boolean reusable=true;
		Mask.isReusable(reusable);
		
		String fit="N95";
		boolean adjustable=true;
		Mask.wearMask(fit,adjustable);
		
		boolean safelyRemoved=true;
		String disposalMethod="Trash Bin";
		Mask.removeMask(safelyRemoved,disposalMethod);
		
		boolean bulkPurchase = false;
		char sizeLabel = 'M';
		String storeName = "Pharmacy";
		Mask.purchase(bulkPurchase,sizeLabel,storeName);
		
		int efficiency = 95;
		boolean antiViral = true;
		String Certification = "FDA approved";
		Mask.filterEfficiency(efficiency,antiViral,Certification);
		
	}
}