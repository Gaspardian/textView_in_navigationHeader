 //insert app version from Grandle into the textView.setText
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        final TextView textVersion = navigationView.getHeaderView(0).findViewById(R.id.textVersion);
        String versionName = BuildConfig.VERSION_NAME;
        textVersion.setText("Version: " + versionName);
