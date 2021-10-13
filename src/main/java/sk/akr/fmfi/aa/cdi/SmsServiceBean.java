package sk.akr.fmfi.aa.cdi;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class SmsServiceBean implements SmsService {

    public void posliSmsNotifikaciu(Operacia operacia) {
        // volanie externej sluzby
    }
}
