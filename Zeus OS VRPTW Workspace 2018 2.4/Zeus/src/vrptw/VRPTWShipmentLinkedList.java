package vrptw;
import edu.sru.thangiah.zeus.core.ShipmentLinkedList;
import edu.sru.thangiah.zeus.vrp.VRPShipment;
//import edu.sru.thangiah.zeus.core.Shipment;
public class VRPTWShipmentLinkedList 
extends ShipmentLinkedList
implements java.io.Serializable, java.lang.Cloneable{
	
	  public VRPTWShipmentLinkedList() 
	  {
	      setHead(new VRPTWShipment()); //header node for head
	      setTail(new VRPTWShipment()); //tail node for tail
	      linkHeadTail();			  //point head and tail to each other
	      setNumShipments(0);
	  }
	  
	  public void insertShipment(VRPTWShipment shipment)
	  {
		  insertLast(shipment);
	  }
	  
	  public VRPTWShipment getVRPTWHead()
	  {
		  return (VRPTWShipment)getHead();
	  }
	  public VRPTWShipment getVRPTWTail()
	  {
		  return (VRPTWShipment)getTail();
	  }
}
