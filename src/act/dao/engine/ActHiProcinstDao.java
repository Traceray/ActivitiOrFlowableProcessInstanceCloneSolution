/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.act.dao.engine;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.act.entity.engine.ActHiProcinst;

import java.util.List;

/**
 * act_hi_procinstDAO接口
 * @author xiaohelong
 * @version 2017-11-08
 *  * email:xiaohelong2005@126.com
 *       xiaohelong2005@gmail.com
 *       twitter.com/xiaohelong
 */
@MyBatisDao
public interface ActHiProcinstDao extends ActEngineDaoBase<ActHiProcinst> {
    public List<ActHiProcinst> findChildActHiProcinst(ActHiProcinst actHiProcinst);
}