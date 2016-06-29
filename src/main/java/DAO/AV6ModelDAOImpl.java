package DAO;

import JDBC.ConnectionToDB;
import Model.AV6Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AV6ModelDAOImpl implements AV6ModelDAO {

    @Override
    public AV6Model createModel() {
        Connection connection = ConnectionToDB.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
        return null;
    }

    @Override
    public List<AV6Model> readAll() {
        List<AV6Model> result = new ArrayList<>();
        Connection connection = ConnectionToDB.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM table_av6 LIMIT 100;");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                Date date = resultSet.getTimestamp("date");
                String windDirectionName = resultSet.getString("wind_direction_name");
                Integer windSpeed = resultSet.getInt("wind_speed");
                if (resultSet.wasNull()) windSpeed = null;
                Integer windRush = resultSet.getInt("wind_rush");
                if (resultSet.wasNull()) windRush = null;
                Integer visibility = resultSet.getInt("visibility");
                if (resultSet.wasNull()) visibility = null;
                Integer octantsNumerator = resultSet.getInt("octants_numerator");
                if (resultSet.wasNull()) octantsNumerator = null;
                Integer octantsDenominator = resultSet.getInt("octants_denominator");
                if (resultSet.wasNull()) octantsDenominator = null;
                String cloudForm = resultSet.getString("cloudForm");
                Integer cloudiness = resultSet.getInt("cloudiness");
                if (resultSet.wasNull()) cloudiness = null;
                Double temperature = resultSet.getDouble("temperature");
                if (resultSet.wasNull()) temperature = null;
                Double dewPointTemperature = resultSet.getDouble("dew_point_temperature");
                if (resultSet.wasNull()) dewPointTemperature = null;
                Integer relativityHumidity = resultSet.getInt("relativity_humidity");
                if (resultSet.wasNull()) relativityHumidity = null;
                Double absoluteHumidity = resultSet.getDouble("absolute_humidity");
                if (resultSet.wasNull()) absoluteHumidity = null;
                Double atmospherePressure = resultSet.getDouble("atmosphere_pressure");
                if (resultSet.wasNull()) atmospherePressure = null;
                Double barometricTrend = resultSet.getDouble("barometric_trend");
                if (resultSet.wasNull()) barometricTrend = null;
                Double qnhGPa = resultSet.getDouble("qnh_gpa");
                if (resultSet.wasNull()) qnhGPa = null;
                Double qnhMm = resultSet.getDouble("qnh_mm");
                if (resultSet.wasNull()) qnhMm = null;
                Double qfe = resultSet.getDouble("qfe");
                if (resultSet.wasNull()) qfe = null;
                result.add(new AV6Model(id, date, windDirectionName, windSpeed, windRush, visibility, octantsNumerator, octantsDenominator, cloudForm, cloudiness, temperature, dewPointTemperature, relativityHumidity, absoluteHumidity, atmospherePressure, barometricTrend, qnhGPa, qnhMm, qfe));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
        return result;
    }

    @Override
    public AV6Model readAV6ModelById(int id) {
        Connection connection = ConnectionToDB.getConnection();
        AV6Model result = null;
        try {
            PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM table_av6 WHERE id=?;");
            pStatement.setInt(1, id);
            ResultSet resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                Date date = resultSet.getTimestamp("date");
                String windDirectionName = resultSet.getString("wind_direction_name");
                Integer windSpeed = resultSet.getInt("wind_speed");
                if (resultSet.wasNull()) windSpeed = null;
                Integer windRush = resultSet.getInt("wind_rush");
                if (resultSet.wasNull()) windRush = null;
                Integer visibility = resultSet.getInt("visibility");
                if (resultSet.wasNull()) visibility = null;
                Integer octantsNumerator = resultSet.getInt("octants_numerator");
                if (resultSet.wasNull()) octantsNumerator = null;
                Integer octantsDenominator = resultSet.getInt("octants_denominator");
                if (resultSet.wasNull()) octantsDenominator = null;
                String cloudForm = resultSet.getString("cloudForm");
                Integer cloudiness = resultSet.getInt("cloudiness");
                if (resultSet.wasNull()) cloudiness = null;
                Double temperature = resultSet.getDouble("temperature");
                if (resultSet.wasNull()) temperature = null;
                Double dewPointTemperature = resultSet.getDouble("dew_point_temperature");
                if (resultSet.wasNull()) dewPointTemperature = null;
                Integer relativityHumidity = resultSet.getInt("relativity_humidity");
                if (resultSet.wasNull()) relativityHumidity = null;
                Double absoluteHumidity = resultSet.getDouble("absolute_humidity");
                if (resultSet.wasNull()) absoluteHumidity = null;
                Double atmospherePressure = resultSet.getDouble("atmosphere_pressure");
                if (resultSet.wasNull()) atmospherePressure = null;
                Double barometricTrend = resultSet.getDouble("barometric_trend");
                if (resultSet.wasNull()) barometricTrend = null;
                Double qnhGPa = resultSet.getDouble("qnh_gpa");
                if (resultSet.wasNull()) qnhGPa = null;
                Double qnhMm = resultSet.getDouble("qnh_mm");
                if (resultSet.wasNull()) qnhMm = null;
                Double qfe = resultSet.getDouble("qfe");
                if (resultSet.wasNull()) qfe = null;
                result = new AV6Model(date, windDirectionName, windSpeed, windRush, visibility, octantsNumerator, octantsDenominator, cloudForm, cloudiness, temperature, dewPointTemperature, relativityHumidity, absoluteHumidity, atmospherePressure, barometricTrend, qnhGPa, qnhMm, qfe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
        return result;
    }

    @Override
    public void updateModel(AV6Model av6Model) {
        Connection connection = ConnectionToDB.getConnection();
        try {
            PreparedStatement pStatement = connection.prepareStatement("UPDATE table_av6 SET wind_direction_name=?, wind_speed=?, wind_rush=?, visibility=?, octants_numerator=?, octants_denominator=?, cloudForm=?, cloudiness=?, temperature=?, dew_point_temperature=?, relativity_humidity=?, absolute_humidity=?, atmosphere_pressure=?, barometric_trend=?, qnh_gpa=?, qnh_mm=?, qfe=? WHERE id=?;");
            pStatement.setString(1, av6Model.getWindDirectionName());
            if (av6Model.getWindSpeed() != null) pStatement.setInt(2, av6Model.getWindSpeed());
            else pStatement.setNull(2, Types.INTEGER);
            if (av6Model.getWindRush() != null) pStatement.setInt(3, av6Model.getWindRush());
            else pStatement.setNull(3, Types.INTEGER);
            if(av6Model.getVisibility() != null) pStatement.setInt(4, av6Model.getVisibility());
            else pStatement.setNull(4, Types.INTEGER);
            if (av6Model.getOctantsNumerator() != null) pStatement.setInt(5, av6Model.getOctantsNumerator());
            else pStatement.setNull(5, Types.INTEGER);
            if (av6Model.getOctantsDenominator() != null) pStatement.setInt(6, av6Model.getOctantsDenominator());
            else pStatement.setNull(6, Types.INTEGER);
            pStatement.setString(7, av6Model.getCloudForm());
            if (av6Model.getCloudiness() != null) pStatement.setInt(8, av6Model.getCloudiness());
            else pStatement.setNull(8, Types.DOUBLE);
            if (av6Model.getTemperature() != null) pStatement.setDouble(9, av6Model.getTemperature());
            else pStatement.setNull(9, Types.DOUBLE);
            if (av6Model.getDewPointTemperature() != null) pStatement.setDouble(10, av6Model.getDewPointTemperature());
            else pStatement.setNull(10, Types.DOUBLE);
            if (av6Model.getRelativityHumidity() != null) pStatement.setInt(11, av6Model.getRelativityHumidity());
            else pStatement.setNull(11, Types.INTEGER);
            if (av6Model.getAbsoluteHumidity() != null) pStatement.setDouble(12, av6Model.getAbsoluteHumidity());
            else pStatement.setNull(12, Types.DOUBLE);
            if (av6Model.getAtmospherePressure() != null) pStatement.setDouble(13, av6Model.getAtmospherePressure());
            else pStatement.setNull(13, Types.DOUBLE);
            if (av6Model.getBarometricTrend() != null) pStatement.setDouble(14, av6Model.getBarometricTrend());
            else pStatement.setNull(14, Types.DOUBLE);
            if (av6Model.getQnhGPa() != null) pStatement.setDouble(15, av6Model.getQnhGPa());
            else pStatement.setNull(15, Types.DOUBLE);
            if (av6Model.getQnhMm() != null) pStatement.setDouble(16, av6Model.getQnhMm());
            else pStatement.setNull(16, Types.DOUBLE);
            if (av6Model.getQfe() != null) pStatement.setDouble(17, av6Model.getQfe());
            else pStatement.setNull(17, Types.DOUBLE);
            pStatement.setInt(18, av6Model.getId());
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
    }

    @Override
    public void deleteModelById(int id) {
        Connection connection = ConnectionToDB.getConnection();
        try {
            PreparedStatement pStatement = connection.prepareStatement("DELETE FROM table_av6 WHERE id = ?;");
            pStatement.setInt(1, id);
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
    }
}
