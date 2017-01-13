package step5;

public class ProductService {

	public ProductVO findProductVOByName(ProductVO[] pa, String string) {
		for(int i=0;i<pa.length;i++)
			if(pa[i].getName().equals(string))
				return pa[i];
		return null;
	}

	public ProductVO[] findProductListByMaker(ProductVO[] pa, String string) {
		int count = 0;
		for(int i=0;i<pa.length;i++)
			if(pa[i].getMaker().equals(string))
				count++;
		ProductVO[] pvo = new ProductVO[count];
		for(int i=0;i<pa.length;i++)
			if(pa[i].getMaker().equals(string))
				pvo[--count] = pa[i];
		return pvo;
	}
}
