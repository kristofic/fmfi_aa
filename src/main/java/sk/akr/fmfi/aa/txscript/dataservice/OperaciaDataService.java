package sk.akr.fmfi.aa.txscript.dataservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sk.akr.fmfi.aa.to.OperaciaTO;

public class OperaciaDataService {

    public long vytvorOperaciu(OperaciaTO operaciaTO) {
        // vlozi operaciu do databazy, vrati id
        log.info("Vkladam operaciu {} do databazy.", operaciaTO);
        return 1L;
    }

    private static final Logger log = LogManager.getLogger();
}
