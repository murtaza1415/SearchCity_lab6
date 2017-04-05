package searchcityfinal;

import java.util.ArrayList;
import dao.CityDao;
import model.City;


/**
 *
 * @author MuhammadMurtaza
 */
public class SearchCityFinal {
   public static void main(String[] args) {
		ArrayList<City> cityList = new ArrayList<City>();
		City e1=new City();  
		e1.setId(1);  e1.setLongitude(1000);  e1.setLatitude(500); e1.setCountry("Karachi");
		cityList.add(e1);
		
		City e2=new City();  
		e2.setId(2);  e2.setLongitude(1000);  e2.setLatitude(500); e2.setCountry("Islamabad"); 			
                cityList.add(e2);
    		CityDao cityDao = new CityDao();
		try{
			cityDao.save(cityList);
		}finally{
			cityDao.finalize();
		}
	}
}
