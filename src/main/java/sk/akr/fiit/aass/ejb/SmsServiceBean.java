package sk.akr.fiit.aass.ejb;

import javax.ejb.Stateless;

@Stateless
public class SmsServiceBean implements SmsService {

    public void posliSmsNotifikaciu(Operacia operacia) {
        // volanie externej sluzby
    }
}