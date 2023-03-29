package com.testing.hashmaps;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;

@Entity
public class Era {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eraID;
    private String eraName;
    @Embedded
    private Album albumOfEra;
    private String eraDescription;
    private String[] eraColorScheme;
    @Embedded
    private EraStyle eraStyle;
    private String eraIconicQuote;
    private boolean ownsMastersOfEra;
    private String[] eraInspiration;

}
