package sk.akr.fmfi.aa.interceptor;

import jakarta.ejb.Local;
import sk.akr.fmfi.aa.to.OperaciaTO;

@Local
public interface OperacieService {

    void vytvorOperaciu(OperaciaTO operaciaTO);
}
