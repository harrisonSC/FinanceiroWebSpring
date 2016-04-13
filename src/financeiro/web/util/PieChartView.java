package financeiro.web.util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.PieChartModel;

import financeiro.bolsa.acao.AcaoVirtual;
import financeiro.web.AcaoBean;
 
@ManagedBean
public class PieChartView implements Serializable {

	private static final long serialVersionUID = 7021078529782470103L;
	private PieChartModel pieModel1;
    private PieChartModel pieModel2;
 
    @PostConstruct
    public void init() {
        createPieModels();
    }
 
    public PieChartModel getPieModel1() {
        return pieModel1;
    }
     
    public PieChartModel getPieModel2() {
        return pieModel2;
    }
     
    private void createPieModels() {
        createPieModel1();
        createPieModel2();
    }
 
    private void createPieModel1() {
        pieModel1 = new PieChartModel();

        AcaoBean acao = new AcaoBean();
         System.out.println("Harrison");
         /*       List<AcaoVirtual> ind = acao.getLista();
         System.out.println();
        for (int i = 0; i < ind.length; i++) {
        	 String label = String.valueOf(ind[3]);
        	 Integer qtdeacao = Integer.valueOf((String) ind[4]);
        	 pieModel1.set(label, qtdeacao);
         }*/
         
         
        pieModel1.setLegendPosition("w");
    }
     
    private void createPieModel2() {
        pieModel2 = new PieChartModel();
         
         
        pieModel1.setLegendPosition("e");
    }
     
}







