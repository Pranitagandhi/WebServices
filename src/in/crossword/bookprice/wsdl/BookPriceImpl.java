package in.crossword.bookprice.wsdl;

import javax.jws.WebService;
import in.crossword.bookprice.types.BookName;
import in.crossword.bookprice.types.Price;

@WebService(endpointInterface = "in.crossword.bookprice.wsdl.BookPriceImpl")
public class BookPriceImpl implements BookPrice {

	@Override
	public Price grtPrice(BookName bookName) {
		Price price = new Price();

		if (bookName.getName().equalsIgnoreCase("C")) {

			price.setPrice(100);
		} else if (bookName.getName().equalsIgnoreCase("java")) {

			price.setPrice(200);

		} else {
			price.setPrice(0);
		}
		return price;
	}

}
