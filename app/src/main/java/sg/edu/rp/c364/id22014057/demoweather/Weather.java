package sg.edu.rp.c364.id22014057.demoweather;

class Weather {
    String area;
    String forecast;

    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }


    @Override
    public String toString() {
        return  "Area: '" + area + "\n" +
                "Forecast: " + forecast;
    }

}
