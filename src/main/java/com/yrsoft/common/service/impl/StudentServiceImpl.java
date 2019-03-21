package com.yrsoft.common.service.impl;

import com.yrsoft.common.entity.Student;
import com.yrsoft.common.mapper.StudentMapper;
import com.yrsoft.common.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xk
 * @since 2018-12-26
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
