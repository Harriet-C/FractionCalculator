package chapter10_section06;

public interface IGradeBook
{
	void addScore(int studentId, double score);
	double getAverageScore(int studentId);
	void save(String filename);
	void load(String filename);
}