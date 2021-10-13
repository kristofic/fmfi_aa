package sk.akr.fmfi.aa.cmt;

import jakarta.ejb.Local;
import sk.akr.fmfi.aa.to.OperaciaTO;

@Local
public interface OperacieService {

    void vytvorOperaciu(OperaciaTO operaciaTO);
}
