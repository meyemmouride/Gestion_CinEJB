package org.example.ejbserver.interfaces;


import org.example.ejbserver.entities.CD;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CDManagerRemote {
    void addCD(CD cd);
    List<CD> getAllCDs();
}

