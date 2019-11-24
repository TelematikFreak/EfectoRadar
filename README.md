# EfectoRadar
Radar animation in button using: ripplebackground library of https://github.com/skyfishjy

To change the animation:

    app:rb_color [color def:@android:color/holo_blue_dark] --> Color of the ripple
    app:rb_radius [dimension def:64dp ] --> Radius of the ripple
    app:rb_duration [integer def:3000 ] --> Duration of one ripple animation (millisecond)
    app:rb_rippleAmount [integer def:6] --> Max amount of ripples at one screen
    app:rb_scale [interger def:6] --> Scale of ripple at the end of one animation cycle
    app:rb_type [enum (fillRipple, strokeRipple) def:fillRipple] --> Filled circle or ring
    app:rb_strokeWidth [dimension def:2dp] --> Stroke width of the ripple, ONLY work when rb_type="strokeRipple"


Thanks to Skyfishjy!

<div>Icons made by <a href="https://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
