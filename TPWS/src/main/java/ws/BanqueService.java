package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convertEuToMad")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11;
    }
    public Compte getCompte(int code){
        return new Compte(code, 9000,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, 8000,new Date()),
                new Compte(2, 9000,new Date()),
                new Compte(3, 4000,new Date())
                );

    }
}
