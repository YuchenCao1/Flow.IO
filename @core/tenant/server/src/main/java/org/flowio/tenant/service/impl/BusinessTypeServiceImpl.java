package org.flowio.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.flowio.tenant.entity.BusinessType;
import org.flowio.tenant.exception.BusinessTypeNotFoundException;
import org.flowio.tenant.mapper.BusinessTypeMapper;
import org.flowio.tenant.service.BusinessTypeService;
import org.springframework.stereotype.Service;

@Service
public class BusinessTypeServiceImpl extends ServiceImpl<BusinessTypeMapper, BusinessType> implements BusinessTypeService {
    @Override
    public BusinessType getByIdOrThrow(Integer id) {
        BusinessType businessType = getById(id);
        if (businessType == null) {
            throw new BusinessTypeNotFoundException();
        }
        return businessType;
    }
}