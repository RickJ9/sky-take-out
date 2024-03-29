package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品ID查询对应套餐ID
     * @param dishIds
     * @return
     */
    //select semeal_id from setmeal_Dish where dish_id in (1,2,3,4)
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量保存套餐和菜品的关联关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
