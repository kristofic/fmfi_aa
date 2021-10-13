package sk.akr.fmfi.aa.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class SmsServiceBean implements SmsService {

    public void posliSmsNotifikaciu(Operacia operacia) {
        // volanie externej sluzby
    }
}
