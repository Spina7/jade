package examples.slr;

//package examples.slr;
import examples.slr.*;
import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class SLRAgent extends Agent {
    private SLRGui myGui;
    public SLR obj1;
    double dt0 = 0;
    double dt1 = 0;
    double res = 0;

    protected void setup() {
        myGui = new SLRGui(this);
        obj1 = new SLR();
        myGui.showGui();
        dt0 = obj1.wrtBZero();
        dt1 = obj1.wrtBOne();
        System.out.println("y = B0: " + dt0 + " + B1x1: " + dt1);
    }

    public void predition(final double v1) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                double v2 = v1;
                v2 = Math.round(v2 * 100.0) / 100d;
                res = dt0 + (dt1 * v2);
                res = Math.round(res * 100.0) / 100d;
                System.out.println("Y= " + res);
            }
        });
    }
}