package cn.itrip.dao;

import cn.itrip.beans.pojo.ItripHotelExtendProperty;
import cn.itrip.beans.pojo.ItripHotelExtendPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelExtendPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int countByExample(ItripHotelExtendPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int deleteByExample(ItripHotelExtendPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int insert(ItripHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int insertSelective(ItripHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    List<ItripHotelExtendProperty> selectByExample(ItripHotelExtendPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    ItripHotelExtendProperty selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int updateByExampleSelective(@Param("record") ItripHotelExtendProperty record, @Param("example") ItripHotelExtendPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int updateByExample(@Param("record") ItripHotelExtendProperty record, @Param("example") ItripHotelExtendPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int updateByPrimaryKeySelective(ItripHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated Tue Apr 25 11:19:39 CST 2017
     */
    int updateByPrimaryKey(ItripHotelExtendProperty record);
}