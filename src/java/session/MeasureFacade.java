/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Measure;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ahmad
 */
@Stateless
public class MeasureFacade extends AbstractFacade<Measure> {
    @PersistenceContext(unitName = "Project_controlPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MeasureFacade() {
        super(Measure.class);
    }
    
}
