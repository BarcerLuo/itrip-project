package cn.itrip.service.itripHotel;
import cn.itrip.beans.pojo.ItripHotel;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
import cn.itrip.common.Page;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ItripHotelService {

    public ItripHotel getItripHotelById(Long id)throws Exception;

    public List<ItripHotel>	getItripHotelListByMap(Map<String,Object> param)throws Exception;

    public Integer getItripHotelCountByMap(Map<String,Object> param)throws Exception;

    public Integer insertItripHotel(ItripHotel itripHotel)throws Exception;

    public Integer updateItripHotel(ItripHotel itripHotel)throws Exception;

    public Integer deleteItripHotelById(Long id)throws Exception;

}
