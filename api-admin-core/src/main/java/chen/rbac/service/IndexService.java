package chen.rbac.service;

import chen.rbac.vo.BarVO;
import chen.rbac.vo.LabelVO;
import chen.rbac.vo.PanelVO;

import java.util.List;
import java.util.Map;

public interface IndexService {
    /**
     * 后台首页统计1:项目主要数据统计面板
     * @return List<PanelVO>
     */
    List<PanelVO> statistics1();

    /**
     * 后台首页统计2: echarts柱状图
     * @return BarVO
     */
    BarVO statistics2();

    /**
     * 后台首页统计3: 分类统计标签
     * @return Map<String, List<LabelVO>>
     */
    Map<String, List<LabelVO>> statistics3();
}
