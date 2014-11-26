package de.saxsys.edu.jsf.dynamicform;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DynamicformBean implements Serializable {

	private static final long serialVersionUID = -7167736346573906213L;
	private static final Logger LOGGER = Logger.getLogger(DynamicformBean.class.getName());
    private List<Data> values;
    private List<Data> savedValues = new LinkedList<>();

    @PostConstruct
    public void init() {
        values = new LinkedList<>();
        values.add(new Data());
    }

    public void submit() {
        // save values in database
    	savedValues.clear();
    	savedValues.addAll(values);
    }

    public void extend() {
    	StringBuilder sb = new StringBuilder("Extend : ");
        for (Data data : values) {
            sb.append(data.getDate().toString() + " ");
        }
        LOGGER.info(sb.toString());
        values.add(new Data());

    }
    
    public boolean isExtendable() {
    	return values.size() < 5;
    }

    public void setValues(List<Data> values) {
        this.values = values;
    }

    public List<Data> getValues() {
        return values;
    }
    
    public List<Data> getSavedValues() {
    	return savedValues;
    }

}
