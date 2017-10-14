package dev.local.services;

import dev.local.domain.Project;
import dev.local.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by wangpeng on 2017/4/18.
 */
public interface ProjectService {
    Project add(Project project, User user);
    Project delete(String id);
    Page<Project> findRelated(String userId, boolean enabled, boolean archived, Pageable pageable);
    Project findById(String id);
    Project update(Project project);
}
