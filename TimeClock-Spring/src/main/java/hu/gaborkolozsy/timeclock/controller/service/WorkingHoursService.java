/*
 * Copyright (c) 2017, Gabor Kolozsy. All rights reserved.
 */

package hu.gaborkolozsy.timeclock.controller.service;

import hu.gaborkolozsy.timeclock.model.WorkingHours;

/**
 * Extended {@code WorkingHoursService} interface.
 *
 * @author Gabor Kolozsy (gabor.kolozsy.development@gmail.com)
 * @since 0.0.1-SNAPSHOT
 */
public interface WorkingHoursService extends CommonService<WorkingHours, Integer> {

    /**
     * Check if the instance is a managed entity instance belonging to the 
     * current persistence context.
     * @param primaryKey primary key
     * @return boolean indicating if entity is in persistence context
     */
    boolean isWorkingHoursExist(Integer primaryKey);
    
    /**
     * Returns an iterable collection of the {@link WorkingHours} entity 
     * by the specified {@code developerId} foreign key.
     * @param developerId developer ID
     * @return an iterable collection of {@code WorkingHours} 
     */
    Iterable<WorkingHours> getAllByDeveloperId(Integer developerId);

    /**
     * Update all {@link WorkingHours}' {@code developerId} by the specified 
     * foreign key.
     * @param oldDeveloperId the old developer ID
     * @param newDeveloperId the new developer ID
     */
    void updateAllDeveloperIdBySpecifiedId(Integer oldDeveloperId, Integer newDeveloperId);
    
    /**
     * Remove all {@link WorkingHours} entity with specified {@code developerId}
     * foreign key.
     * @param developerId developer ID
     */
    void removeAllWorkingHoursByDeveloperId(Integer developerId);
    
}