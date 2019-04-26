package com.orangehaswing.rise.modular.system.mapper;

import com.orangehaswing.rise.core.common.node.TreeviewNode;
import com.orangehaswing.rise.core.common.node.ZTreeNode;
import com.orangehaswing.rise.modular.system.entity.Dept;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2018-12-07
 */
public interface DeptMapper extends BaseMapper<Dept> {

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();

    /**
     * 获取所有部门列表
     */
    List<Map<String, Object>> list(@Param("condition") String condition, @Param("deptId") String deptId);

    /**
     * 获取所有部门树列表
     */
    List<TreeviewNode> treeviewNodes();
}
