package sk.akr.fmfi.aa.interceptor;

import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;

@Stateless
@Interceptors({AuditInterceptor.class})
public class SmsServiceBean implements SmsService {

    public void posliSmsNotifikaciu(Operacia operacia) {
        // volanie externej sluzby
    }
}
